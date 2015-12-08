.class public final Lcom/android/volley/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/volley/r$a;,
        Lcom/android/volley/r$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/android/volley/b$a;

.field public final c:Lcom/android/volley/w;

.field public d:Z


# direct methods
.method private constructor <init>(Lcom/android/volley/w;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/r;->d:Z

    .line 88
    iput-object v1, p0, Lcom/android/volley/r;->a:Ljava/lang/Object;

    .line 89
    iput-object v1, p0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    .line 90
    iput-object p1, p0, Lcom/android/volley/r;->c:Lcom/android/volley/w;

    .line 91
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/android/volley/b$a;)V
    .locals 1

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/r;->d:Z

    .line 81
    iput-object p1, p0, Lcom/android/volley/r;->a:Ljava/lang/Object;

    .line 82
    iput-object p2, p0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/volley/r;->c:Lcom/android/volley/w;

    .line 84
    return-void
.end method

.method public static a(Lcom/android/volley/w;)Lcom/android/volley/r;
    .locals 1

    .prologue
    .line 56
    new-instance v0, Lcom/android/volley/r;

    invoke-direct {v0, p0}, Lcom/android/volley/r;-><init>(Lcom/android/volley/w;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;
    .locals 1

    .prologue
    .line 47
    new-instance v0, Lcom/android/volley/r;

    invoke-direct {v0, p0, p1}, Lcom/android/volley/r;-><init>(Ljava/lang/Object;Lcom/android/volley/b$a;)V

    return-object v0
.end method
