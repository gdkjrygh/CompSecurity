.class final Lkik/a/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/security/KeyPair;

.field final synthetic b:Lkik/a/b/b;


# direct methods
.method constructor <init>(Lkik/a/b/b;Ljava/security/KeyPair;)V
    .locals 0

    .prologue
    .line 431
    iput-object p1, p0, Lkik/a/b/c;->b:Lkik/a/b/b;

    iput-object p2, p0, Lkik/a/b/c;->a:Ljava/security/KeyPair;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lkik/a/b/c;->a:Ljava/security/KeyPair;

    return-object v0
.end method
