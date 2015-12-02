.class public Lcom/facebook/orca/sms/x;
.super Ljava/lang/Object;
.source "MmsSmsBackgroundLoginHook.java"

# interfaces
.implements Lcom/facebook/auth/broadcast/c;


# instance fields
.field private final a:Lcom/facebook/orca/nux/h;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/orca/sms/af;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/nux/h;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/sms/af;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/sms/x;->a:Lcom/facebook/orca/nux/h;

    .line 25
    iput-object p2, p0, Lcom/facebook/orca/sms/x;->b:Lcom/facebook/prefs/shared/d;

    .line 26
    iput-object p3, p0, Lcom/facebook/orca/sms/x;->c:Lcom/facebook/orca/sms/af;

    .line 27
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 31
    iget-object v0, p0, Lcom/facebook/orca/sms/x;->a:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/sms/x;->a:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    iget-object v0, p0, Lcom/facebook/orca/sms/x;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 33
    sget-object v1, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 34
    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 35
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 36
    iget-object v0, p0, Lcom/facebook/orca/sms/x;->c:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/af;->c()V

    .line 38
    :cond_0
    return-void
.end method
