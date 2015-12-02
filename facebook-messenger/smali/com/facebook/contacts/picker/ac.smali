.class public Lcom/facebook/contacts/picker/ac;
.super Ljava/lang/Object;
.source "ContactPickerMergedFilter.java"


# instance fields
.field private final a:Lcom/facebook/contacts/picker/u;

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/picker/u;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/contacts/picker/ac;->a:Lcom/facebook/contacts/picker/u;

    .line 38
    iput-object p2, p0, Lcom/facebook/contacts/picker/ac;->b:Ljava/lang/String;

    .line 39
    iput-boolean p3, p0, Lcom/facebook/contacts/picker/ac;->c:Z

    .line 40
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/contacts/picker/ac;->a:Lcom/facebook/contacts/picker/u;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 47
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/ac;->c:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/contacts/picker/ac;->b:Ljava/lang/String;

    return-object v0
.end method
