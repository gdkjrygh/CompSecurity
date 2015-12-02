.class public Lcom/facebook/orca/reflex/h;
.super Lcom/facebook/base/activity/a;
.source "ReflexThreadListExperiment.java"


# instance fields
.field private a:Lcom/facebook/orca/reflex/e;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/reflex/e;)V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    .line 84
    iput-object p1, p0, Lcom/facebook/orca/reflex/h;->a:Lcom/facebook/orca/reflex/e;

    .line 85
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 89
    instance-of v0, p1, Lcom/facebook/orca/threadlist/s;

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/reflex/h;->a:Lcom/facebook/orca/reflex/e;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/reflex/e;->a(Landroid/app/Activity;)V

    .line 92
    :cond_0
    return-void
.end method
