.class final Lkik/a/j/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/j/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/j/o;

.field private b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lkik/a/j/o;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 389
    iput-object p1, p0, Lkik/a/j/o$a;->a:Lkik/a/j/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 390
    iput-object p2, p0, Lkik/a/j/o$a;->b:Ljava/lang/Class;

    .line 391
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 383
    check-cast p1, Lcom/kik/n/a/e/a;

    iget-object v0, p0, Lkik/a/j/o$a;->a:Lkik/a/j/o;

    invoke-virtual {v0}, Lkik/a/j/o;->a()[B

    move-result-object v0

    invoke-static {p1, v0}, Lkik/a/h/o;->a(Lcom/kik/n/a/e/a;[B)[B

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/o$a;->b:Ljava/lang/Class;

    invoke-static {v0, v1}, Lkik/a/h/g;->a([BLjava/lang/Class;)Lcom/b/a/n;

    move-result-object v0

    return-object v0
.end method
