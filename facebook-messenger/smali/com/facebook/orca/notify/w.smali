.class public Lcom/facebook/orca/notify/w;
.super Lcom/facebook/orca/notify/ai;
.source "LoggedOutMessageNotification.java"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/push/g;

.field private e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/push/g;)V
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/orca/notify/aj;->LOGGED_OUT:Lcom/facebook/orca/notify/aj;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ai;-><init>(Lcom/facebook/orca/notify/aj;)V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/notify/w;->b:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/notify/w;->c:Ljava/lang/String;

    .line 32
    iput-object p3, p0, Lcom/facebook/orca/notify/w;->d:Lcom/facebook/push/g;

    .line 33
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/notify/w;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 58
    iput-boolean p1, p0, Lcom/facebook/orca/notify/w;->e:Z

    .line 59
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/notify/w;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/notify/w;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/facebook/push/g;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/notify/w;->d:Lcom/facebook/push/g;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/facebook/orca/notify/w;->e:Z

    return v0
.end method
