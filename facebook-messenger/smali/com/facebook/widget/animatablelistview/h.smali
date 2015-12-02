.class public Lcom/facebook/widget/animatablelistview/h;
.super Ljava/lang/Object;
.source "AnimatingListMutation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/widget/animatablelistview/i;

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final c:I

.field private final d:Lcom/a/a/a;

.field private final e:Z


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/widget/animatablelistview/i;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/h;->b:Ljava/lang/Object;

    .line 40
    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/h;->a:Lcom/facebook/widget/animatablelistview/i;

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/animatablelistview/h;->c:I

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/h;->d:Lcom/a/a/a;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/widget/animatablelistview/h;->e:Z

    .line 44
    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/widget/animatablelistview/i;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/h;->b:Ljava/lang/Object;

    .line 70
    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/h;->a:Lcom/facebook/widget/animatablelistview/i;

    .line 71
    iput p3, p0, Lcom/facebook/widget/animatablelistview/h;->c:I

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/h;->d:Lcom/a/a/a;

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/widget/animatablelistview/h;->e:Z

    .line 74
    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/widget/animatablelistview/i;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/h;->b:Ljava/lang/Object;

    .line 55
    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/h;->a:Lcom/facebook/widget/animatablelistview/i;

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/animatablelistview/h;->c:I

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/h;->d:Lcom/a/a/a;

    .line 58
    iput-boolean p3, p0, Lcom/facebook/widget/animatablelistview/h;->e:Z

    .line 59
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/widget/animatablelistview/i;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/h;->a:Lcom/facebook/widget/animatablelistview/i;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/facebook/widget/animatablelistview/h;->c:I

    return v0
.end method

.method public d()Lcom/a/a/a;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/h;->d:Lcom/a/a/a;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 108
    iget-boolean v0, p0, Lcom/facebook/widget/animatablelistview/h;->e:Z

    return v0
.end method
