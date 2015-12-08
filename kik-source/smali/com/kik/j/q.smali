.class public final Lcom/kik/j/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/e/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lkik/a/ac;

    invoke-direct {v0, p1, p2, p3}, Lkik/a/ac;-><init>(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V

    iput-object v0, p0, Lcom/kik/j/q;->a:Lkik/a/e/q;

    .line 21
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/e/q;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/j/q;->a:Lkik/a/e/q;

    return-object v0
.end method
