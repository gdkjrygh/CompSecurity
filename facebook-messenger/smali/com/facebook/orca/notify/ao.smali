.class public Lcom/facebook/orca/notify/ao;
.super Lcom/facebook/orca/notify/ai;
.source "NewBuildNotification.java"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Landroid/content/Intent;

.field private f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/facebook/orca/notify/aj;->NEW_BUILD:Lcom/facebook/orca/notify/aj;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ai;-><init>(Lcom/facebook/orca/notify/aj;)V

    .line 22
    iput-object p1, p0, Lcom/facebook/orca/notify/ao;->b:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/facebook/orca/notify/ao;->c:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/facebook/orca/notify/ao;->d:Ljava/lang/String;

    .line 25
    iput-object p4, p0, Lcom/facebook/orca/notify/ao;->e:Landroid/content/Intent;

    .line 26
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/notify/ao;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 50
    iput-boolean p1, p0, Lcom/facebook/orca/notify/ao;->f:Z

    .line 51
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/notify/ao;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/notify/ao;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/notify/ao;->e:Landroid/content/Intent;

    return-object v0
.end method
