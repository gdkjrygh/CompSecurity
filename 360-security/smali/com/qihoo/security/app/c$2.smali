.class Lcom/qihoo/security/app/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/app/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/app/c;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/qihoo/security/app/c$2;->a:Lcom/qihoo/security/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/qihoo/security/app/c$2;->a:Lcom/qihoo/security/app/c;

    invoke-static {p2}, Lcom/qihoo/security/floatview/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/floatview/a/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/app/c;->a(Lcom/qihoo/security/app/c;Lcom/qihoo/security/floatview/a/b;)Lcom/qihoo/security/floatview/a/b;

    .line 72
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lcom/qihoo/security/app/c$2;->a:Lcom/qihoo/security/app/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/app/c;->a(Lcom/qihoo/security/app/c;Lcom/qihoo/security/floatview/a/b;)Lcom/qihoo/security/floatview/a/b;

    .line 80
    return-void
.end method
