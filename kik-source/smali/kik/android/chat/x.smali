.class final Lkik/android/chat/x;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/f;

.field final synthetic b:Lkik/a/e/f;

.field final synthetic c:Lkik/a/d/aa;

.field final synthetic d:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;Lcom/kik/g/f;Lkik/a/e/f;Lkik/a/d/aa;)V
    .locals 0

    .prologue
    .line 1600
    iput-object p1, p0, Lkik/android/chat/x;->d:Lkik/android/chat/KikApplication;

    iput-object p2, p0, Lkik/android/chat/x;->a:Lcom/kik/g/f;

    iput-object p3, p0, Lkik/android/chat/x;->b:Lkik/a/e/f;

    iput-object p4, p0, Lkik/android/chat/x;->c:Lkik/a/d/aa;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 1600
    iget-object v0, p0, Lkik/android/chat/x;->a:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    iget-object v8, p0, Lkik/android/chat/x;->b:Lkik/a/e/f;

    new-instance v0, Lkik/a/f/f/ao;

    iget-object v2, p0, Lkik/android/chat/x;->c:Lkik/a/d/aa;

    iget-object v5, v2, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v6, v1

    move-object v7, v1

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    return-void
.end method
