.class Lcom/qihoo/security/opti/trashclear/ui/h$5$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/a/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/h$5;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Long;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/h$5;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h$5;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 1591
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;->b:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;->a:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 1594
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;->b:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Z)Z

    .line 1607
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;->b:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;->a:Ljava/lang/Long;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/lang/Long;)V

    .line 1608
    return-void
.end method
