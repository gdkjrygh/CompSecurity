.class public final Lcom/c/b/bu$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bu$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 1211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1212
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/bu$c$a;->a:Z

    .line 1213
    sget v0, Lcom/c/b/bu$c$b;->a:I

    iput v0, p0, Lcom/c/b/bu$c$a;->b:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/c/b/bu$c;
    .locals 4

    .prologue
    .line 1226
    new-instance v0, Lcom/c/b/bu$c;

    iget-boolean v1, p0, Lcom/c/b/bu$c$a;->a:Z

    iget v2, p0, Lcom/c/b/bu$c$a;->b:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bu$c;-><init>(ZIB)V

    return-object v0
.end method
