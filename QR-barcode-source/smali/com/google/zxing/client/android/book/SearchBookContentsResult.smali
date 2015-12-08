.class final Lcom/google/zxing/client/android/book/SearchBookContentsResult;
.super Ljava/lang/Object;
.source "SearchBookContentsResult.java"


# static fields
.field private static query:Ljava/lang/String;


# instance fields
.field private final pageId:Ljava/lang/String;

.field private final pageNumber:Ljava/lang/String;

.field private final snippet:Ljava/lang/String;

.field private final validSnippet:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    sput-object v0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->query:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .param p1, "pageId"    # Ljava/lang/String;
    .param p2, "pageNumber"    # Ljava/lang/String;
    .param p3, "snippet"    # Ljava/lang/String;
    .param p4, "validSnippet"    # Z

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->pageId:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->pageNumber:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->snippet:Ljava/lang/String;

    .line 40
    iput-boolean p4, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->validSnippet:Z

    .line 41
    return-void
.end method

.method public static getQuery()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    sget-object v0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->query:Ljava/lang/String;

    return-object v0
.end method

.method public static setQuery(Ljava/lang/String;)V
    .locals 0
    .param p0, "query"    # Ljava/lang/String;

    .prologue
    .line 44
    sput-object p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->query:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method public getPageId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->pageId:Ljava/lang/String;

    return-object v0
.end method

.method public getPageNumber()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->pageNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->snippet:Ljava/lang/String;

    return-object v0
.end method

.method public getValidSnippet()Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/google/zxing/client/android/book/SearchBookContentsResult;->validSnippet:Z

    return v0
.end method
