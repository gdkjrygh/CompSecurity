.class public final Lcom/bumptech/glide/g/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/g/a/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/graphics/drawable/Drawable;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/g/a/f",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/g/a/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/a/k",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:I

.field private c:Lcom/bumptech/glide/g/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/a/c",
            "<TT;>;"
        }
    .end annotation
.end field

.field private d:Lcom/bumptech/glide/g/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g/a/c",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a/a;-><init>(B)V

    .line 31
    return-void
.end method

.method private constructor <init>(B)V
    .locals 2

    .prologue
    .line 34
    new-instance v0, Lcom/bumptech/glide/g/a/k;

    new-instance v1, Lcom/bumptech/glide/g/a/b;

    invoke-direct {v1}, Lcom/bumptech/glide/g/a/b;-><init>()V

    invoke-direct {v0, v1}, Lcom/bumptech/glide/g/a/k;-><init>(Lcom/bumptech/glide/g/a/j;)V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/g/a/a;-><init>(Lcom/bumptech/glide/g/a/k;)V

    .line 35
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/g/a/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g/a/k",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/bumptech/glide/g/a/a;->a:Lcom/bumptech/glide/g/a/k;

    .line 47
    const/16 v0, 0x12c

    iput v0, p0, Lcom/bumptech/glide/g/a/a;->b:I

    .line 48
    return-void
.end method


# virtual methods
.method public final a(ZZ)Lcom/bumptech/glide/g/a/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/bumptech/glide/g/a/d",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 52
    if-eqz p1, :cond_0

    .line 53
    invoke-static {}, Lcom/bumptech/glide/g/a/g;->b()Lcom/bumptech/glide/g/a/d;

    move-result-object v0

    .line 57
    :goto_0
    return-object v0

    .line 54
    :cond_0
    if-eqz p2, :cond_2

    .line 1062
    iget-object v0, p0, Lcom/bumptech/glide/g/a/a;->c:Lcom/bumptech/glide/g/a/c;

    if-nez v0, :cond_1

    .line 1063
    iget-object v0, p0, Lcom/bumptech/glide/g/a/a;->a:Lcom/bumptech/glide/g/a/k;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/bumptech/glide/g/a/k;->a(ZZ)Lcom/bumptech/glide/g/a/d;

    move-result-object v0

    .line 1065
    new-instance v1, Lcom/bumptech/glide/g/a/c;

    iget v2, p0, Lcom/bumptech/glide/g/a/a;->b:I

    invoke-direct {v1, v0, v2}, Lcom/bumptech/glide/g/a/c;-><init>(Lcom/bumptech/glide/g/a/d;I)V

    iput-object v1, p0, Lcom/bumptech/glide/g/a/a;->c:Lcom/bumptech/glide/g/a/c;

    .line 1067
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/g/a/a;->c:Lcom/bumptech/glide/g/a/c;

    goto :goto_0

    .line 1071
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/g/a/a;->d:Lcom/bumptech/glide/g/a/c;

    if-nez v0, :cond_3

    .line 1072
    iget-object v0, p0, Lcom/bumptech/glide/g/a/a;->a:Lcom/bumptech/glide/g/a/k;

    invoke-virtual {v0, v2, v2}, Lcom/bumptech/glide/g/a/k;->a(ZZ)Lcom/bumptech/glide/g/a/d;

    move-result-object v0

    .line 1074
    new-instance v1, Lcom/bumptech/glide/g/a/c;

    iget v2, p0, Lcom/bumptech/glide/g/a/a;->b:I

    invoke-direct {v1, v0, v2}, Lcom/bumptech/glide/g/a/c;-><init>(Lcom/bumptech/glide/g/a/d;I)V

    iput-object v1, p0, Lcom/bumptech/glide/g/a/a;->d:Lcom/bumptech/glide/g/a/c;

    .line 1076
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/g/a/a;->d:Lcom/bumptech/glide/g/a/c;

    goto :goto_0
.end method
