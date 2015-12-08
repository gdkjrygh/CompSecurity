.class Lcom/google/inject/spi/MembersInjectorLookup$1;
.super Ljava/lang/Object;
.source "MembersInjectorLookup.java"

# interfaces
.implements Lcom/google/inject/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/spi/MembersInjectorLookup;->getMembersInjector()Lcom/google/inject/MembersInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/MembersInjector",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/spi/MembersInjectorLookup;


# direct methods
.method constructor <init>(Lcom/google/inject/spi/MembersInjectorLookup;)V
    .locals 0

    .prologue
    .line 90
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup$1;, "Lcom/google/inject/spi/MembersInjectorLookup.1;"
    iput-object p1, p0, Lcom/google/inject/spi/MembersInjectorLookup$1;->this$0:Lcom/google/inject/spi/MembersInjectorLookup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public injectMembers(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 92
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup$1;, "Lcom/google/inject/spi/MembersInjectorLookup.1;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup$1;->this$0:Lcom/google/inject/spi/MembersInjectorLookup;

    # getter for: Lcom/google/inject/spi/MembersInjectorLookup;->delegate:Lcom/google/inject/MembersInjector;
    invoke-static {v0}, Lcom/google/inject/spi/MembersInjectorLookup;->access$000(Lcom/google/inject/spi/MembersInjectorLookup;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This MembersInjector cannot be used until the Injector has been created."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/google/inject/spi/MembersInjectorLookup$1;->this$0:Lcom/google/inject/spi/MembersInjectorLookup;

    # getter for: Lcom/google/inject/spi/MembersInjectorLookup;->delegate:Lcom/google/inject/MembersInjector;
    invoke-static {v0}, Lcom/google/inject/spi/MembersInjectorLookup;->access$000(Lcom/google/inject/spi/MembersInjectorLookup;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/inject/MembersInjector;->injectMembers(Ljava/lang/Object;)V

    .line 95
    return-void

    .line 92
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 98
    .local p0, "this":Lcom/google/inject/spi/MembersInjectorLookup$1;, "Lcom/google/inject/spi/MembersInjectorLookup.1;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MembersInjector<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/spi/MembersInjectorLookup$1;->this$0:Lcom/google/inject/spi/MembersInjectorLookup;

    # getter for: Lcom/google/inject/spi/MembersInjectorLookup;->type:Lcom/google/inject/TypeLiteral;
    invoke-static {v1}, Lcom/google/inject/spi/MembersInjectorLookup;->access$100(Lcom/google/inject/spi/MembersInjectorLookup;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
