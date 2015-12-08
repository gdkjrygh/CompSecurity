.class public abstract Lcom/c/a/b/j;
.super Lcom/c/a/b/o;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/b/c;


# static fields
.field private static final a:[Ljava/util/Map$Entry;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 214
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Map$Entry;

    sput-object v0, Lcom/c/a/b/j;->a:[Ljava/util/Map$Entry;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 216
    invoke-direct {p0}, Lcom/c/a/b/o;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/j;
    .locals 1

    .prologue
    .line 57
    new-instance v0, Lcom/c/a/b/ak;

    invoke-direct {v0, p0, p1}, Lcom/c/a/b/ak;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e()Lcom/c/a/b/j;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/c/a/b/f;->a:Lcom/c/a/b/f;

    return-object v0
.end method


# virtual methods
.method public abstract a()Lcom/c/a/b/j;
.end method

.method public final synthetic f()Lcom/c/a/b/k;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/c/a/b/j;->a()Lcom/c/a/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/j;->d()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/c/a/b/j;->a()Lcom/c/a/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/j;->d()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method
