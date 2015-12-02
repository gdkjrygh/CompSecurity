.class public abstract Lcom/facebook/i/a/a/b;
.super Ljava/lang/Object;
.source "PeerStateRole.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# static fields
.field static a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/facebook/i/a/a/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/net/Uri;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 58
    new-instance v0, Lcom/facebook/i/a/a/c;

    invoke-direct {v0}, Lcom/facebook/i/a/a/c;-><init>()V

    sput-object v0, Lcom/facebook/i/a/a/b;->a:Ljava/util/Comparator;

    return-void
.end method

.method protected constructor <init>(Landroid/net/Uri;I)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/facebook/i/a/a/b;->b:Landroid/net/Uri;

    .line 79
    iput p2, p0, Lcom/facebook/i/a/a/b;->c:I

    .line 80
    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/a/b;)I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/facebook/i/a/a/b;->c:I

    return v0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V
.end method

.method public abstract a(Landroid/os/Bundle;)V
.end method

.method public abstract a(Landroid/net/Uri;Ljava/lang/Object;)Z
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public b()I
    .locals 1

    .prologue
    .line 120
    iget v0, p0, Lcom/facebook/i/a/a/b;->c:I

    return v0
.end method

.method public abstract b(Landroid/os/Bundle;)V
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/i/a/a/b;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 134
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 129
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
