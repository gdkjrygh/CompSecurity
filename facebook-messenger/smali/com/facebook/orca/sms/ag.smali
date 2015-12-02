.class Lcom/facebook/orca/sms/ag;
.super Ljava/lang/Object;
.source "MmsSmsLogger.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/sms/af;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/orca/sms/ag;->a:Lcom/facebook/orca/sms/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 5

    .prologue
    .line 66
    sget-object v0, Lcom/facebook/orca/prefs/n;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    :cond_0
    sget-object v0, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 70
    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    .line 72
    sget-object v2, Lcom/facebook/orca/prefs/n;->i:Lcom/facebook/prefs/shared/ae;

    const/4 v3, 0x1

    invoke-interface {p1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v2

    .line 74
    sget-object v3, Lcom/facebook/orca/prefs/n;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v3

    .line 76
    iget-object v4, p0, Lcom/facebook/orca/sms/ag;->a:Lcom/facebook/orca/sms/af;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/facebook/orca/sms/af;->a(ZZZZ)V

    .line 82
    :cond_1
    return-void
.end method
