.class public Lezvcard/property/SimpleProperty;
.super Lezvcard/property/VCardProperty;
.source "SimpleProperty.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lezvcard/property/VCardProperty;"
    }
.end annotation


# instance fields
.field protected value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 49
    .local p0, "this":Lezvcard/property/SimpleProperty;, "Lezvcard/property/SimpleProperty<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 50
    iput-object p1, p0, Lezvcard/property/SimpleProperty;->value:Ljava/lang/Object;

    .line 51
    return-void
.end method


# virtual methods
.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    .local p0, "this":Lezvcard/property/SimpleProperty;, "Lezvcard/property/SimpleProperty<TT;>;"
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/SimpleProperty;->value:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 72
    const-string v0, "Property value is null."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    :cond_0
    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 58
    .local p0, "this":Lezvcard/property/SimpleProperty;, "Lezvcard/property/SimpleProperty<TT;>;"
    iget-object v0, p0, Lezvcard/property/SimpleProperty;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 66
    .local p0, "this":Lezvcard/property/SimpleProperty;, "Lezvcard/property/SimpleProperty<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lezvcard/property/SimpleProperty;->value:Ljava/lang/Object;

    .line 67
    return-void
.end method
