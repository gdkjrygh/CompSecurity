.class Lcom/facebook/ui/images/c/i;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/cache/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/facebook/ui/images/c/i;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/i;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/cache/a;
    .locals 20

    .prologue
    .line 115
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/ui/images/c/i;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Landroid/app/ActivityManager;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Landroid/app/ActivityManager;

    .line 116
    new-instance v3, Lcom/facebook/ui/images/cache/a;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/ui/images/c/i;->e()Lcom/facebook/inject/ab;

    move-result-object v4

    const-class v5, Landroid/content/Context;

    invoke-interface {v4, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const-class v5, Lcom/facebook/ui/media/attachments/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/ui/media/attachments/d;

    const-class v6, Lcom/facebook/ui/images/a/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/ui/images/a/a;

    const-class v7, Lcom/facebook/prefs/shared/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/prefs/shared/d;

    const-class v8, Lcom/facebook/common/time/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/time/a;

    const-class v9, Lcom/facebook/ui/c/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/ui/c/d;

    const-class v10, Lcom/facebook/analytics/cache/h;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/analytics/cache/h;

    const-class v11, Lcom/facebook/analytics/j/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/analytics/j/a;

    const-class v12, Lcom/facebook/common/e/h;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/common/e/h;

    invoke-virtual {v13}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v13

    const-class v14, Ljava/lang/Boolean;

    const-class v15, Lcom/facebook/ui/images/base/IsLargeImageCacheEnabled;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v15}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    const-class v15, Ljava/lang/String;

    const-class v16, Lcom/facebook/ui/images/base/ImageCacheReportingPrefix;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v15, v1}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    const-class v16, Lcom/facebook/analytics/av;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/analytics/av;

    const-class v17, Lcom/facebook/cache/j;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/c/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/facebook/cache/j;

    const-class v18, Lcom/facebook/common/w/q;

    const-class v19, Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ui/images/c/i;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v18

    invoke-direct/range {v3 .. v18}, Lcom/facebook/ui/images/cache/a;-><init>(Landroid/content/Context;Lcom/facebook/ui/media/attachments/d;Lcom/facebook/ui/images/a/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;IZLjava/lang/String;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/i;->a()Lcom/facebook/ui/images/cache/a;

    move-result-object v0

    return-object v0
.end method
