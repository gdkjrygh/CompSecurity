.class final Lcom/kik/g/h;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/k;

.field final synthetic b:Lcom/kik/g/f;


# direct methods
.method constructor <init>(Lcom/kik/g/f;Lcom/kik/g/k;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/kik/g/h;->b:Lcom/kik/g/f;

    iput-object p2, p0, Lcom/kik/g/h;->a:Lcom/kik/g/k;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/kik/g/h;->a:Lcom/kik/g/k;

    invoke-virtual {v0, p2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 147
    return-void
.end method
