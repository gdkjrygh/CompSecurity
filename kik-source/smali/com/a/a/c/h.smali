.class final Lcom/a/a/c/h;
.super Lb/a/a/a/a/c/l;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/a/a/c/g;


# direct methods
.method constructor <init>(Lcom/a/a/c/g;)V
    .locals 0

    .prologue
    .line 656
    iput-object p1, p0, Lcom/a/a/c/h;->a:Lcom/a/a/c/g;

    invoke-direct {p0}, Lb/a/a/a/a/c/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 664
    sget v0, Lb/a/a/a/a/c/i;->d:I

    return v0
.end method

.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 656
    iget-object v0, p0, Lcom/a/a/c/h;->a:Lcom/a/a/c/g;

    invoke-virtual {v0}, Lcom/a/a/c/g;->c()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
