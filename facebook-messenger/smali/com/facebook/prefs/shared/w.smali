.class public Lcom/facebook/prefs/shared/w;
.super Lcom/facebook/d/d/a;
.source "FbSharedPropertyDatabaseSupplier.java"


# static fields
.field private static final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/prefs/shared/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/w;->a:Lcom/google/common/a/es;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/prefs/shared/y;)V
    .locals 7
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 28
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "non_cached_preferences_db"

    sget-object v6, Lcom/facebook/prefs/shared/w;->a:Lcom/google/common/a/es;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 36
    iput-object p4, p0, Lcom/facebook/prefs/shared/w;->b:Lcom/facebook/prefs/shared/y;

    .line 37
    return-void
.end method
