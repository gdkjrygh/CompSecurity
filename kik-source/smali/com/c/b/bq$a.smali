.class final Lcom/c/b/bq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/util/Iterator;

.field private static final b:Ljava/lang/Iterable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 591
    new-instance v0, Lcom/c/b/bs;

    invoke-direct {v0}, Lcom/c/b/bs;-><init>()V

    sput-object v0, Lcom/c/b/bq$a;->a:Ljava/util/Iterator;

    .line 606
    new-instance v0, Lcom/c/b/bt;

    invoke-direct {v0}, Lcom/c/b/bt;-><init>()V

    sput-object v0, Lcom/c/b/bq$a;->b:Ljava/lang/Iterable;

    return-void
.end method

.method static a()Ljava/lang/Iterable;
    .locals 1

    .prologue
    .line 615
    sget-object v0, Lcom/c/b/bq$a;->b:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic b()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 589
    sget-object v0, Lcom/c/b/bq$a;->a:Ljava/util/Iterator;

    return-object v0
.end method
