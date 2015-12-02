.class public Lcom/android/volley/k;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/volley/k$a;,
        Lcom/android/volley/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Lcom/android/volley/a$a;

.field public final c:Lcom/android/volley/VolleyError;

.field public d:Z


# direct methods
.method private constructor <init>(Lcom/android/volley/VolleyError;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/k;->d:Z

    .line 81
    iput-object v1, p0, Lcom/android/volley/k;->a:Ljava/lang/Object;

    .line 82
    iput-object v1, p0, Lcom/android/volley/k;->b:Lcom/android/volley/a$a;

    .line 83
    iput-object p1, p0, Lcom/android/volley/k;->c:Lcom/android/volley/VolleyError;

    .line 84
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/android/volley/a$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/android/volley/a$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/k;->d:Z

    .line 75
    iput-object p1, p0, Lcom/android/volley/k;->a:Ljava/lang/Object;

    .line 76
    iput-object p2, p0, Lcom/android/volley/k;->b:Lcom/android/volley/a$a;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/volley/k;->c:Lcom/android/volley/VolleyError;

    .line 78
    return-void
.end method

.method public static a(Lcom/android/volley/VolleyError;)Lcom/android/volley/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/volley/VolleyError;",
            ")",
            "Lcom/android/volley/k",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 52
    new-instance v0, Lcom/android/volley/k;

    invoke-direct {v0, p0}, Lcom/android/volley/k;-><init>(Lcom/android/volley/VolleyError;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Lcom/android/volley/a$a;)Lcom/android/volley/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/android/volley/a$a;",
            ")",
            "Lcom/android/volley/k",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 44
    new-instance v0, Lcom/android/volley/k;

    invoke-direct {v0, p0, p1}, Lcom/android/volley/k;-><init>(Ljava/lang/Object;Lcom/android/volley/a$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/android/volley/k;->c:Lcom/android/volley/VolleyError;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
