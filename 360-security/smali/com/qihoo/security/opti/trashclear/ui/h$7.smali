.class Lcom/qihoo/security/opti/trashclear/ui/h$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/h;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/qihoo/security/opti/trashclear/ui/h;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V
    .locals 0

    .prologue
    .line 2104
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->d:Lcom/qihoo/security/opti/trashclear/ui/h;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    iput p3, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->b:I

    iput p4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/opti/trashclear/ui/b;)V
    .locals 4

    .prologue
    .line 2109
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/b;->dismiss()V

    .line 2110
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->d:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->b:I

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h$7;->c:I

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    .line 2111
    return-void
.end method
