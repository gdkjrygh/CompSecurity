.class public abstract Lcom/facebook/orca/notify/ai;
.super Ljava/lang/Object;
.source "MessagingNotification.java"


# instance fields
.field public final a:Lcom/facebook/orca/notify/aj;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/facebook/orca/notify/aj;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/notify/ai;->a:Lcom/facebook/orca/notify/aj;

    .line 24
    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/facebook/orca/notify/ai;->b:Z

    return v0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/notify/ai;->b:Z

    .line 47
    return-void
.end method
