.class final Lcom/google/android/gms/internal/fl$d;
.super Lcom/google/android/gms/internal/de$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/fk;",
        ">.c<",
        "Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic rr:Lcom/google/android/gms/internal/fl;

.field private final rs:Lcom/google/android/gms/common/ConnectionResult;

.field private final rt:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/data/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fl$d;->rr:Lcom/google/android/gms/internal/fl;

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/de$c;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/fl$d;->rs:Lcom/google/android/gms/common/ConnectionResult;

    iput-object p5, p0, Lcom/google/android/gms/internal/fl$d;->rt:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Lcom/google/android/gms/common/data/d;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/fl$d;->rs:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz p2, :cond_0

    new-instance v0, Lcom/google/android/gms/plus/model/people/PersonBuffer;

    invoke-direct {v0, p2}, Lcom/google/android/gms/plus/model/people/PersonBuffer;-><init>(Lcom/google/android/gms/common/data/d;)V

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/fl$d;->rt:Ljava/lang/String;

    invoke-interface {p1, v1, v0, v2}, Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;->onPeopleLoaded(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/plus/model/people/PersonBuffer;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/fl$d;->a(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method
