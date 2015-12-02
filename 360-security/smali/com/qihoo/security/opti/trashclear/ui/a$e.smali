.class final Lcom/qihoo/security/opti/trashclear/ui/a$e;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/a;

.field private final b:Lcom/qihoo/security/opti/trashclear/ui/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/qihoo/security/opti/trashclear/ui/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/a$d",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/a;Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo/security/opti/trashclear/ui/a$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;",
            "Lcom/qihoo/security/opti/trashclear/ui/a$d",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 700
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->a:Lcom/qihoo/security/opti/trashclear/ui/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 701
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 702
    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->c:Lcom/qihoo/security/opti/trashclear/ui/a$d;

    .line 703
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 710
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->c:Lcom/qihoo/security/opti/trashclear/ui/a$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eqz v0, :cond_0

    .line 711
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->c:Lcom/qihoo/security/opti/trashclear/ui/a$d;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/a$e;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/a$d;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 713
    :cond_0
    return-void
.end method
