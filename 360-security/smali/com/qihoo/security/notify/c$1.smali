.class Lcom/qihoo/security/notify/c$1;
.super Lcom/qihoo/security/service/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/notify/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/c;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/qihoo/security/notify/c$1;->a:Lcom/qihoo/security/notify/c;

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
    .line 146
    iget-object v0, p0, Lcom/qihoo/security/notify/c$1;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0, p1}, Lcom/qihoo/security/notify/c;->a(Lcom/qihoo/security/notify/c;I)I

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/notify/c$1;->a:Lcom/qihoo/security/notify/c;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/c;->c()V

    .line 148
    return-void
.end method
