.class final Lcom/c/b/as$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/b/as$a;


# direct methods
.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 0

    .prologue
    .line 574
    iput-object p1, p0, Lcom/c/b/as$a$a;->a:Lcom/c/b/as$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 574
    invoke-direct {p0, p1}, Lcom/c/b/as$a$a;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 578
    iget-object v0, p0, Lcom/c/b/as$a$a;->a:Lcom/c/b/as$a;

    invoke-virtual {v0}, Lcom/c/b/as$a;->q()V

    .line 579
    return-void
.end method
