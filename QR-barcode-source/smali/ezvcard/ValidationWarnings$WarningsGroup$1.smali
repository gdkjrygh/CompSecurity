.class Lezvcard/ValidationWarnings$WarningsGroup$1;
.super Ljava/lang/Object;
.source "ValidationWarnings.java"

# interfaces
.implements Lezvcard/util/StringUtils$JoinCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lezvcard/ValidationWarnings$WarningsGroup;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lezvcard/util/StringUtils$JoinCallback",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lezvcard/ValidationWarnings$WarningsGroup;

.field final synthetic val$prefix:Ljava/lang/String;


# direct methods
.method constructor <init>(Lezvcard/ValidationWarnings$WarningsGroup;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lezvcard/ValidationWarnings$WarningsGroup$1;->this$0:Lezvcard/ValidationWarnings$WarningsGroup;

    iput-object p2, p0, Lezvcard/ValidationWarnings$WarningsGroup$1;->val$prefix:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic handle(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/StringBuilder;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 208
    check-cast p2, Ljava/lang/String;

    .end local p2    # "x1":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lezvcard/ValidationWarnings$WarningsGroup$1;->handle(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public handle(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1
    .param p1, "sb"    # Ljava/lang/StringBuilder;
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 210
    iget-object v0, p0, Lezvcard/ValidationWarnings$WarningsGroup$1;->val$prefix:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    return-void
.end method
