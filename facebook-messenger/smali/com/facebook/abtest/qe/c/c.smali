.class public Lcom/facebook/abtest/qe/c/c;
.super Lcom/facebook/d/d/a;
.source "QuickExperimentDbSupplier.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# instance fields
.field private final a:Lcom/facebook/abtest/qe/c/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/abtest/qe/c/a;)V
    .locals 7
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 32
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "qe_db"

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 40
    iput-object p4, p0, Lcom/facebook/abtest/qe/c/c;->a:Lcom/facebook/abtest/qe/c/a;

    .line 41
    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/c;->a:Lcom/facebook/abtest/qe/c/a;

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/c/c;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/c/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 46
    return-void
.end method
