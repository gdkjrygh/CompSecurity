.class Lcom/facebook/orca/contacts/divebar/bo;
.super Ljava/lang/Object;
.source "RichPresenceExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/c",
        "<",
        "Lcom/facebook/orca/contacts/divebar/bp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/bn;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/bn;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bo;->a:Lcom/facebook/orca/contacts/divebar/bn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/bo;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/bp;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/bp;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bo;->a:Lcom/facebook/orca/contacts/divebar/bn;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/divebar/bn;->a(Lcom/facebook/orca/contacts/divebar/bn;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/bp;

    move-result-object v0

    return-object v0
.end method
