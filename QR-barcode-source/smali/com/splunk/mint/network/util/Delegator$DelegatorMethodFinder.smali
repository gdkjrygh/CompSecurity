.class public Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;
.super Ljava/lang/Object;
.source "Delegator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/splunk/mint/network/util/Delegator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DelegatorMethodFinder"
.end annotation


# instance fields
.field private final method:Ljava/lang/reflect/Method;

.field final synthetic this$0:Lcom/splunk/mint/network/util/Delegator;


# direct methods
.method public varargs constructor <init>(Lcom/splunk/mint/network/util/Delegator;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 2
    .param p2, "methodName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 152
    .local p3, "parameterTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    iput-object p1, p0, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;->this$0:Lcom/splunk/mint/network/util/Delegator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    :try_start_0
    # getter for: Lcom/splunk/mint/network/util/Delegator;->superclass:Ljava/lang/Class;
    invoke-static {p1}, Lcom/splunk/mint/network/util/Delegator;->access$000(Lcom/splunk/mint/network/util/Delegator;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;->method:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 161
    return-void

    .line 156
    :catch_0
    move-exception v0

    .line 157
    .local v0, "e":Ljava/lang/RuntimeException;
    throw v0

    .line 158
    .end local v0    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v0

    .line 159
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Lcom/splunk/mint/network/util/DelegationException;

    invoke-direct {v1, v0}, Lcom/splunk/mint/network/util/DelegationException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "parameters"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 165
    iget-object v1, p0, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;->this$0:Lcom/splunk/mint/network/util/Delegator;

    iget-object v2, p0, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;->method:Ljava/lang/reflect/Method;

    # invokes: Lcom/splunk/mint/network/util/Delegator;->invoke0(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    invoke-static {v1, v2, p1}, Lcom/splunk/mint/network/util/Delegator;->access$100(Lcom/splunk/mint/network/util/Delegator;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 166
    .local v0, "t":Ljava/lang/Object;, "TT;"
    return-object v0
.end method
