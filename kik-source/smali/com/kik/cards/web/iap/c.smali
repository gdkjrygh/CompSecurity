.class final Lcom/kik/cards/web/iap/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/iap/b;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/iap/b;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/cards/web/iap/c;->a:Lcom/kik/cards/web/iap/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lcom/kik/cards/web/iap/c;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {p2}, Lcom/android/a/a/a$a;->a(Landroid/os/IBinder;)Lcom/android/a/a/a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/cards/web/iap/b;->a(Lcom/kik/cards/web/iap/b;Lcom/android/a/a/a;)Lcom/android/a/a/a;

    .line 81
    iget-object v0, p0, Lcom/kik/cards/web/iap/c;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v0}, Lcom/kik/cards/web/iap/b;->a(Lcom/kik/cards/web/iap/b;)V

    .line 82
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/kik/cards/web/iap/c;->a:Lcom/kik/cards/web/iap/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kik/cards/web/iap/b;->a(Lcom/kik/cards/web/iap/b;Lcom/android/a/a/a;)Lcom/android/a/a/a;

    .line 74
    return-void
.end method
