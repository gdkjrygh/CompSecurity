.class Lcom/qihoo/security/floatview/a/a$3;
.super Lcom/qihoo/security/service/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/floatview/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/a/a;)V
    .locals 0

    .prologue
    .line 485
    iput-object p1, p0, Lcom/qihoo/security/floatview/a/a$3;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-direct {p0}, Lcom/qihoo/security/service/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 489
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$3;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/floatview/ui/a;->b(I)V

    .line 491
    return-void
.end method
