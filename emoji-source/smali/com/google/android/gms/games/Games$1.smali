.class final Lcom/google/android/gms/games/Games$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/Games;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/Api$b",
        "<",
        "Lcom/google/android/gms/games/internal/GamesClientImpl;",
        "Lcom/google/android/gms/games/Games$GamesOptions;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/gy;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/games/Games$GamesOptions;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/Games$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/gy;Lcom/google/android/gms/games/Games$GamesOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/gy;Lcom/google/android/gms/games/Games$GamesOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    .locals 17

    if-nez p4, :cond_0

    new-instance p4, Lcom/google/android/gms/games/Games$GamesOptions;

    const/4 v1, 0x0

    move-object/from16 v0, p4

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/Games$GamesOptions;-><init>(Lcom/google/android/gms/games/Games$1;)V

    :cond_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/gy;->fn()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/gy;->fj()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/gy;->fm()[Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/gy;->fk()I

    move-result v9

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/gy;->fo()Landroid/view/View;

    move-result-object v10

    move-object/from16 v0, p4

    iget-boolean v11, v0, Lcom/google/android/gms/games/Games$GamesOptions;->MM:Z

    move-object/from16 v0, p4

    iget-boolean v12, v0, Lcom/google/android/gms/games/Games$GamesOptions;->MN:Z

    move-object/from16 v0, p4

    iget v13, v0, Lcom/google/android/gms/games/Games$GamesOptions;->MO:I

    move-object/from16 v0, p4

    iget-boolean v14, v0, Lcom/google/android/gms/games/Games$GamesOptions;->MP:Z

    move-object/from16 v0, p4

    iget v15, v0, Lcom/google/android/gms/games/Games$GamesOptions;->MQ:I

    move-object/from16 v0, p4

    iget-object v0, v0, Lcom/google/android/gms/games/Games$GamesOptions;->MR:Ljava/lang/String;

    move-object/from16 v16, v0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v16}, Lcom/google/android/gms/games/internal/GamesClientImpl;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;ZZIZILjava/lang/String;)V

    return-object v1
.end method

.method public getPriority()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
