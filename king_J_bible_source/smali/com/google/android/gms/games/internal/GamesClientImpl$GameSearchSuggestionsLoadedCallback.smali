.class final Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedCallback;
.super Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;

# interfaces
.implements Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "GameSearchSuggestionsLoadedCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback",
        "<",
        "Lcom/google/android/gms/common/api/a$d",
        "<",
        "Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;",
        ">;>;",
        "Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;"
    }
.end annotation


# instance fields
.field final synthetic IJ:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final IR:Lcom/google/android/gms/common/data/DataHolder;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0
    .param p3, "data"    # Lcom/google/android/gms/common/data/DataHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;",
            ">;",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "resultHolder":Lcom/google/android/gms/common/api/a$d;, "Lcom/google/android/gms/common/api/a$d<Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;>;"
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedCallback;->IJ:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl$ResultDataHolderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedCallback;->IR:Lcom/google/android/gms/common/data/DataHolder;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;",
            ">;",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")V"
        }
    .end annotation

    invoke-interface {p1, p0}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/a$d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedCallback;->a(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method
