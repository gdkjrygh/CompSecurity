.class public Lcom/facebook/orca/a/n;
.super Ljava/lang/Object;
.source "SendMessageParametersExperimentProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/orca/a/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/a/k;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/a/k;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/a/n;->a:Lcom/facebook/orca/a/k;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/a/j;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/a/n;->a:Lcom/facebook/orca/a/k;

    invoke-virtual {v0}, Lcom/facebook/orca/a/k;->a()Lcom/facebook/orca/a/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0}, Lcom/facebook/orca/a/n;->a()Lcom/facebook/orca/a/j;

    move-result-object v0

    return-object v0
.end method
