.class Lcom/qihoo/security/opti/trashclear/ui/h$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/h;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/qihoo/security/opti/trashclear/ui/a$c",
        "<",
        "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/h;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V
    .locals 0

    .prologue
    .line 850
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$2;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 854
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$2;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 855
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$2;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 857
    return-void
.end method
