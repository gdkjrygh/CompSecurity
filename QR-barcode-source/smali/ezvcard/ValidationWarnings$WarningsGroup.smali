.class public Lezvcard/ValidationWarnings$WarningsGroup;
.super Ljava/lang/Object;
.source "ValidationWarnings.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/ValidationWarnings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WarningsGroup"
.end annotation


# instance fields
.field private final messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final property:Lezvcard/property/VCardProperty;


# direct methods
.method public constructor <init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V
    .locals 0
    .param p1, "property"    # Lezvcard/property/VCardProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/property/VCardProperty;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 173
    .local p2, "messages":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Lezvcard/ValidationWarnings$WarningsGroup;->property:Lezvcard/property/VCardProperty;

    .line 175
    iput-object p2, p0, Lezvcard/ValidationWarnings$WarningsGroup;->messages:Ljava/util/List;

    .line 176
    return-void
.end method


# virtual methods
.method public getMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 192
    iget-object v0, p0, Lezvcard/ValidationWarnings$WarningsGroup;->messages:Ljava/util/List;

    return-object v0
.end method

.method public getProperty()Lezvcard/property/VCardProperty;
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lezvcard/ValidationWarnings$WarningsGroup;->property:Lezvcard/property/VCardProperty;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 207
    iget-object v1, p0, Lezvcard/ValidationWarnings$WarningsGroup;->property:Lezvcard/property/VCardProperty;

    if-nez v1, :cond_0

    const-string v0, ""

    .line 208
    .local v0, "prefix":Ljava/lang/String;
    :goto_0
    iget-object v1, p0, Lezvcard/ValidationWarnings$WarningsGroup;->messages:Ljava/util/List;

    sget-object v2, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    new-instance v3, Lezvcard/ValidationWarnings$WarningsGroup$1;

    invoke-direct {v3, p0, v0}, Lezvcard/ValidationWarnings$WarningsGroup$1;-><init>(Lezvcard/ValidationWarnings$WarningsGroup;Ljava/lang/String;)V

    invoke-static {v1, v2, v3}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Lezvcard/util/StringUtils$JoinCallback;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 207
    .end local v0    # "prefix":Ljava/lang/String;
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lezvcard/ValidationWarnings$WarningsGroup;->property:Lezvcard/property/VCardProperty;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
