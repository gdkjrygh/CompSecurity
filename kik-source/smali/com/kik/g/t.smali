.class final Lcom/kik/g/t;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/kik/g/t;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/kik/g/t;->a:Lcom/kik/g/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 50
    return-void
.end method
