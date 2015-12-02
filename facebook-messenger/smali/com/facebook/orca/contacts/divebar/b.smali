.class Lcom/facebook/orca/contacts/divebar/b;
.super Ljava/lang/Object;
.source "DivebarBadgingExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/c",
        "<",
        "Lcom/facebook/orca/contacts/divebar/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/a;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/b;->a:Lcom/facebook/orca/contacts/divebar/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 88
    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/b;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/d;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/d;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/b;->a:Lcom/facebook/orca/contacts/divebar/a;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/divebar/a;->a(Lcom/facebook/orca/contacts/divebar/a;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/d;

    move-result-object v0

    return-object v0
.end method
