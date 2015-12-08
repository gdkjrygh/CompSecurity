.class final Lcom/kik/g/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/g/c;


# direct methods
.method constructor <init>(Lcom/kik/g/c;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/kik/g/d;->a:Lcom/kik/g/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/kik/g/d;->a:Lcom/kik/g/c;

    invoke-virtual {v0}, Lcom/kik/g/c;->a()V

    .line 24
    return-void
.end method
