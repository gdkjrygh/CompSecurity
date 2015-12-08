.class final Lcom/kik/android/b/c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/android/b/a;


# direct methods
.method constructor <init>(Lcom/kik/android/b/a;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/kik/android/b/c;->a:Lcom/kik/android/b/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 173
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    invoke-static {}, Lcom/kik/android/b/a;->c()Lorg/c/b;

    .line 175
    iget-object v0, p0, Lcom/kik/android/b/c;->a:Lcom/kik/android/b/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kik/android/b/a;->a(Lcom/kik/android/b/a;Z)V

    .line 181
    :cond_0
    :goto_0
    return-void

    .line 177
    :cond_1
    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    invoke-static {}, Lcom/kik/android/b/a;->c()Lorg/c/b;

    .line 179
    iget-object v0, p0, Lcom/kik/android/b/c;->a:Lcom/kik/android/b/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kik/android/b/a;->a(Lcom/kik/android/b/a;Z)V

    goto :goto_0
.end method
