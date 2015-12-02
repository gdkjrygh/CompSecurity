.class public Lcom/facebook/orca/emoji/x;
.super Ljava/lang/Object;
.source "EmojiSet.java"


# instance fields
.field private final a:I

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/emoji/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/emoji/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p1, p0, Lcom/facebook/orca/emoji/x;->a:I

    .line 19
    iput-object p2, p0, Lcom/facebook/orca/emoji/x;->b:Lcom/google/common/a/es;

    .line 20
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/facebook/orca/emoji/x;->a:I

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/emoji/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/emoji/x;->b:Lcom/google/common/a/es;

    return-object v0
.end method
