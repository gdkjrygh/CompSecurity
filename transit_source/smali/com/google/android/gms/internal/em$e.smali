.class final Lcom/google/android/gms/internal/em$e;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">.b<",
        "Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final iC:I

.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final mR:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$e;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    iput p3, p0, Lcom/google/android/gms/internal/em$e;->iC:I

    iput-object p4, p0, Lcom/google/android/gms/internal/em$e;->mR:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/em$e;->iC:I

    iget-object v1, p0, Lcom/google/android/gms/internal/em$e;->mR:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;->onAchievementUpdated(ILjava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/em$e;->a(Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V

    return-void
.end method

.method protected aF()V
    .locals 0

    return-void
.end method
