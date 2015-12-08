.class public Lorg/chromium/ui/autofill/AutofillSuggestion;
.super Ljava/lang/Object;
.source "AutofillSuggestion.java"

# interfaces
.implements Lorg/chromium/ui/DropdownItem;


# instance fields
.field private final mLabel:Ljava/lang/String;

.field private final mSublabel:Ljava/lang/String;

.field private final mSuggestionId:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "suggestionId"    # I

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lorg/chromium/ui/autofill/AutofillSuggestion;->mLabel:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lorg/chromium/ui/autofill/AutofillSuggestion;->mSublabel:Ljava/lang/String;

    .line 26
    iput p3, p0, Lorg/chromium/ui/autofill/AutofillSuggestion;->mSuggestionId:I

    .line 27
    return-void
.end method


# virtual methods
.method public getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lorg/chromium/ui/autofill/AutofillSuggestion;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getSublabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lorg/chromium/ui/autofill/AutofillSuggestion;->mSublabel:Ljava/lang/String;

    return-object v0
.end method

.method public getSuggestionId()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lorg/chromium/ui/autofill/AutofillSuggestion;->mSuggestionId:I

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x1

    return v0
.end method

.method public isGroupHeader()Z
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    return v0
.end method
