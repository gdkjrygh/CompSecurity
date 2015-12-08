.class final Lcom/google/android/gms/internal/fl$b;
.super Lcom/google/android/gms/internal/de$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/fk;",
        ">.c<",
        "Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic rr:Lcom/google/android/gms/internal/fl;

.field private final rs:Lcom/google/android/gms/common/ConnectionResult;

.field private final rt:Ljava/lang/String;

.field private final ru:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/data/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fl$b;->rr:Lcom/google/android/gms/internal/fl;

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/de$c;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/fl$b;->rs:Lcom/google/android/gms/common/ConnectionResult;

    iput-object p5, p0, Lcom/google/android/gms/internal/fl$b;->rt:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/fl$b;->ru:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/fl$b;->rs:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz p2, :cond_0

    new-instance v0, Lcom/google/android/gms/plus/model/moments/MomentBuffer;

    invoke-direct {v0, p2}, Lcom/google/android/gms/plus/model/moments/MomentBuffer;-><init>(Lcom/google/android/gms/common/data/d;)V

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/fl$b;->rt:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/fl$b;->ru:Ljava/lang/String;

    invoke-interface {p1, v1, v0, v2, v3}, Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;->onMomentsLoaded(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/plus/model/moments/MomentBuffer;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/fl$b;->a(Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method
