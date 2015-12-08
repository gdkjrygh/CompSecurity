.class Lcom/a/a/a/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lcom/a/a/a/r;

.field final b:Lcom/a/a/a/t;

.field c:Z


# direct methods
.method constructor <init>(Lcom/a/a/a/r;Lcom/a/a/a/t;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/a/o;->c:Z

    .line 42
    iput-object p1, p0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    .line 43
    iput-object p2, p0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    .line 44
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    invoke-virtual {v0}, Lcom/a/a/a/t;->c()V

    .line 121
    return-void
.end method

.method public final a(Lb/a/a/a/a/g/b;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 115
    iget-boolean v0, p1, Lb/a/a/a/a/g/b;->f:Z

    iput-boolean v0, p0, Lcom/a/a/a/o;->c:Z

    .line 116
    iget-object v0, p0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    invoke-virtual {v0, p1, p2}, Lcom/a/a/a/t;->a(Lb/a/a/a/a/g/b;Ljava/lang/String;)V

    .line 117
    return-void
.end method
