.class final Lcom/kik/ui/fragment/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/ui/fragment/FragmentBase;


# direct methods
.method constructor <init>(Lcom/kik/ui/fragment/FragmentBase;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lcom/kik/ui/fragment/c;->a:Lcom/kik/ui/fragment/FragmentBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/kik/ui/fragment/c;->a:Lcom/kik/ui/fragment/FragmentBase;

    invoke-virtual {v0}, Lcom/kik/ui/fragment/FragmentBase;->P()V

    .line 179
    return-void
.end method
