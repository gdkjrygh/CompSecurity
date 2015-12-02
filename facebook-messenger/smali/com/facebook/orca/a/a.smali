.class public Lcom/facebook/orca/a/a;
.super Ljava/lang/Object;
.source "GroupNameUpsellExperiment.java"


# instance fields
.field private final a:Lcom/facebook/orca/a/b;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/facebook/orca/a/b;I)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/a/a;->a:Lcom/facebook/orca/a/b;

    .line 20
    iput p2, p0, Lcom/facebook/orca/a/a;->b:I

    .line 21
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/a/b;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/a/a;->a:Lcom/facebook/orca/a/b;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/orca/a/a;->b:I

    return v0
.end method
