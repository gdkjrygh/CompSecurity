.class final Lkik/a/j/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/g/p;

.field final synthetic d:Lkik/a/j/o;


# direct methods
.method constructor <init>(Lkik/a/j/o;Ljava/lang/String;Ljava/lang/String;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lkik/a/j/p;->d:Lkik/a/j/o;

    iput-object p2, p0, Lkik/a/j/p;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/j/p;->b:Ljava/lang/String;

    iput-object p4, p0, Lkik/a/j/p;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 88
    iget-object v0, p0, Lkik/a/j/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/j/p;->b:Ljava/lang/String;

    const-string v2, "arKrXQAgwtlbijZ"

    invoke-static {v0, v1, v2}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    .line 90
    iget-object v1, p0, Lkik/a/j/p;->c:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 91
    return-void
.end method
