.class final Lcom/kik/g/v;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 363
    iput-object p1, p0, Lcom/kik/g/v;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/kik/g/v;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 367
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/kik/g/v;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 373
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 378
    iget-object v0, p0, Lcom/kik/g/v;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 379
    return-void
.end method
